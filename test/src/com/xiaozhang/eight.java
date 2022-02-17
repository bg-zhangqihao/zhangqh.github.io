package com.xiaozhang;


public class eight {
    //����һ��max��ʾ���ж��ٸ��ʺ�
    int max = 8;
    //��������array�� ����ʺ���õĽ��
    int[] array = new int[max];
    private static int count = 0;
    public static void main(String[] args) {
        eight queen = new eight();
        queen.check(0);
        System.out.println("һ����" + count + "�ֽⷨ");
    }

    //��дһ�����������õ�n���ʺ�
    //ע��: check ÿһ�εݹ�ʱ�����뵽check�ж���һ��ѭ�������л���
    private void check(int n) {
        if (n == max) {
            showAnswer();
            return;
        }
        //һ�η���ʺ󣬲��жϻʺ��Ƿ��ͻ
        for (int i = 0; i < max; i++) {//����ÿһ�η��ò��ɹ�ʱ����Ҫ�����ڶ��� �����з���
            //�Ȱѵ�ǰ����ʺ�n���ŵ����еĵ�1��
            array[n] = i;
            //�жϵ����õ�n���ʺ�i��ʱ���Ƿ��ͻ
            if (backtrack(n)) {
                //���ŷŵ�n+1���ʺ󣬿�ʼ�ݹ�
                check(n + 1);
            }

            //�����ͻ���ͼ���ִ�� array[n] = i; ������n���ʺ󣬷����ڱ��еĺ��Ƶ�һ��λ��
        }

    }

    //�鿴�����Ƿ���n���ʺ󣬾�ȥ���ûʺ��Ƿ���ѰڷŵĻʺ��ͻ
    /**
     *
     * @param n ��ʾ��n���ʺ�
     * @return ���Ϲ��򷵻�true�� ���򷵻�false
     */
    private boolean backtrack(int n) {
        for (int j = 0; j < n; j++) {   //j����֮ǰ���õĻʺ�� ���·��õĻʺ��Ƿ��г�ͻ��
            //
            //1. array[i] == array[n] ����Ƿ���ͬһ��
            //2. Math.abs(n - i) == Math.abs(array[n] - array[i]) ����Ƿ���ͬһб��
            //
            if (array[j] == array[n] || Math.abs(n - j) == Math.abs(array[n] - array[j])) {
                return false;
            }
        }
        return true;
    }

    //дһ�����������ʺ�ڷŵ�λ�����
    public void showAnswer() {
        count++;   
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + 1 + " ");
        }
        System.out.println();
    }
}
