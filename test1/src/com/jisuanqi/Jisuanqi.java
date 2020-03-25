
package com.jisuanqi;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Jisuanqi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(exec("-8*(((-2+4)+3)/((-1-5)*-2)-5)"));

	} 
	
	/**
	 * 
	 * @param exp
	 *            �����ŵ�������ʽ
	 * @return ������
	 */
	public static double exec(String exp) {

		// ������
		// -8*(((-2+4)+3)/((-1-5)*-2)-5)
		
		
		int leftIndex = exp.lastIndexOf('('); // 16
		
		if (leftIndex == -1) {
			// û������
			// System.out.println("calc" + exp);
			return calc(exp);
		} else {
			// ���������������exec
			// System.out.println("exec" + exp);
			// �����������(λ�� ���Ҷ�Ӧ��)λ��
			
			// (-1-5)*-2)-5) 21
			int rightIndex = exp.substring(leftIndex).indexOf(')') + leftIndex;

			// ȥ�����ı��ʽ������ calc��-1-5��
			double res = calc(exp.substring(leftIndex + 1, rightIndex));
			// ������֯���ʽ
			exp = exp.substring(0, leftIndex) + res
					+ exp.substring(rightIndex + 1);
			// -8*(((-2+4)+3)/( -6 *-2)-5)
			return exec(exp);
		}
		// ���û������ ֱ�ӵ���calc

	}
	
	/**
	 * 
	 * @param exp
	 *            �������ŵ�������ʽ
	 * @return ������
	 */
	public static double calc(String exp) {
		// 1 . ��ȡ�����������������
		List<Double> numbers = sliptNumbers(exp);
		// 2. ��ȡ������������Ĳ�������
		List<Character> ops = sliptOps(exp);
		// 3. �ȳ˳�����
		// ����������е�*��/
		for (int i = 0; i < ops.size(); i++) {
			// * /
			// ��ȡ����������Ƴ���
			char op = ops.get(i);

			// ����� * ���� /�� ����������������Ƴ���ͬ�Ǵ����������е���Ӧ�������λ�õ��������֣��Ƴ����ݣ���������������ǰ˳���ƶ���
			if (op == '*' || op == '/') {
				// ����������������Ƴ�
				ops.remove(i);// �Ƴ���ǰλ��

				// �����������л�ȡ��Ӧ�������λ�õ��������֣��Ƴ���
				double d1 = numbers.remove(i);
				double d2 = numbers.remove(i);

				// ����
				d1 = op == '*' ? d1 * d2 : d1 / d2;

				// �����������뵽���������е�iλ��
				numbers.add(i, d1);// ���뵽i��λ�� ԭ����iλ��һֱ���������ݣ���Ҫ����˲��һλ
				// numbers.set(i, d1);//����iλ���ϵ�����Ϊd1,���಻��
				i--;// �Ƴ��󣬺��������������ǰ�ƶ���Ϊ�˱�֤��һ�������������©������i--
			}// end if (op == '*' || op == '/') {

		}// end for (int i = 0 ; i < ops.size(); i++) {

		// 4. �ټӼ�����
		while (!ops.isEmpty()) {
			// ÿ��ȥ���������е�һ�������
			char op = ops.remove(0);
			// ÿ�δ���������������ȡ��һ������
			double d1 = numbers.remove(0);
			double d2 = numbers.remove(0);

			// ����
			d1 = op == '+' ? d1 + d2 : d1 - d2;

			// �ѽ�����뵽���������еĵ�һ��λ��
			numbers.add(0, d1);
		}

		// 5. ���ؽ��

		return numbers.get(0);
	}
	
	/**
	 * �ӱ��ʽ�з������е������
	 * 
	 * @param exp
	 */
	private static List<Character> sliptOps(String exp) {
		List<Character> ops = new ArrayList<Character>();
		// -8*-2+3/-1-5*-2-5
		// ����ʵ���ʽ�������ı��ʽ
		String formaterExp = formaterExp(exp);
		// @8*@2+3/@1-5*@2-5

		StringTokenizer st = new StringTokenizer(formaterExp, "@0123456789.");
		while (st.hasMoreTokens()) {
			String opStr = st.nextElement() + "";// ȡ���ָ����֮�������
			// System.out.println(numStr);
			// ���ǰ����@ ��Ϊ����
			ops.add(opStr.charAt(0));
		}
		return ops;
	}

	/**
	 * �ӱ��ʽ�з������е�����
	 * 
	 * @param exp
	 *            -8*-2+3/-1-5*-2-5 ���ʽ
	 */
	private static List<Double> sliptNumbers(String exp) {
		List<Double> numbers = new ArrayList<Double>();
		// -8*-2+3/-1-5*-2-5
		// ����ʵ���ʽ�������ı��ʽ
		String formaterExp = formaterExp(exp);
		// @8*@2+3/@1-5*@2-5

		StringTokenizer st = new StringTokenizer(formaterExp, "+-*/");
		while (st.hasMoreTokens()) {
			String numStr = st.nextElement() + "";// ȡ���ָ����֮�������
			// System.out.println(numStr);
			// ���ǰ����@ ��Ϊ����
			if (numStr.charAt(0) == '@') {
				numStr = "-" + numStr.substring(1);
			}

			// �������͵��ַ����������
			numbers.add(Double.parseDouble(numStr));
		}
		return numbers;
	}

	private static String formaterExp(String exp) {
		int index = 0;
		while (index < exp.length()) {
			char c = exp.charAt(index);
			// �ж��Ƿ���-����
			// -������Ǹ��� ��һ����ǰһ�ַ�*/
			if (c == '-') {
				// ��һ����
				if (index == 0) {
					exp = "@" + exp.substring(1);
				} else {
					// ǰһ�ַ�* /
					if (exp.charAt(index - 1) == '*'
							|| exp.charAt(index - 1) == '/') {
						exp = exp.substring(0, index) + "@"
								+ exp.substring(index + 1);
					}
				}
			}

			index++;
			//
		}
		return exp;
	}

}