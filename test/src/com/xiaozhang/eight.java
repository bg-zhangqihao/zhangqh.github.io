package com.xiaozhang;


public class eight {
    //定义一个max表示共有多少个皇后
    int max = 8;
    //定义数组array， 保存皇后放置的结果
    int[] array = new int[max];
    private static int count = 0;
    public static void main(String[] args) {
        eight queen = new eight();
        queen.check(0);
        System.out.println("一共有" + count + "种解法");
    }

    //编写一个方法，放置第n个皇后
    //注意: check 每一次递归时，进入到check中都有一次循环，进行回溯
    private void check(int n) {
        if (n == max) {
            showAnswer();
            return;
        }
        //一次放入皇后，并判断皇后是否冲突
        for (int i = 0; i < max; i++) {//控制每一次放置不成功时，需要的往第二列 第三列放置
            //先把当前这个皇后n，放到该行的第1列
            array[n] = i;
            //判断当放置第n个皇后到i列时，是否冲突
            if (backtrack(n)) {
                //接着放第n+1个皇后，开始递归
                check(n + 1);
            }

            //如果冲突，就继续执行 array[n] = i; 即将第n个皇后，放置在本行的后移的一个位置
        }

    }

    //查看当我们放置n个皇后，就去检查该皇后是否和已摆放的皇后冲突
    /**
     *
     * @param n 表示第n个皇后
     * @return 符合规则返回true， 否则返回false
     */
    private boolean backtrack(int n) {
        for (int j = 0; j < n; j++) {   //j控制之前放置的皇后和 最新放置的皇后是否有冲突。
            //
            //1. array[i] == array[n] 检查是否在同一列
            //2. Math.abs(n - i) == Math.abs(array[n] - array[i]) 检查是否在同一斜线
            //
            if (array[j] == array[n] || Math.abs(n - j) == Math.abs(array[n] - array[j])) {
                return false;
            }
        }
        return true;
    }

    //写一个方法，将皇后摆放的位置输出
    public void showAnswer() {
        count++;   
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + 1 + " ");
        }
        System.out.println();
    }
}
