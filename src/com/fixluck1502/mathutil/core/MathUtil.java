/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fixluck1502.mathutil.core;

/**
 *
 * @author caube
 */
public class MathUtil {
    // trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    // clone class Math của JDK
    // hàm thu viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
    // chọn hàm thiết kế là hàm static

    // hàm tính giai thừa!!!
    // n! = 1 * 2 * 3 * 4 *... * n
    // ko có giai thừa số âm
    // 0! = 1! = 1 quy ước
    // giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    // 20! 18 con số 0, vừa đủ cho kiểu long của Java
    // 21 giai thừa tràn kiểu long
    // bài này quy ước tính n! trong khoảng từ 0...20
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid Argument: N must be between 0 to 20");  
//        }
//        
//        if (n == 0 || n == 1) {
//            return 1; // két thúc cuộc chơi sớm nếu biết những đầu vào đặc biệt
//        }
//        
//        // nếu trong hàm, câu if đã có lệnh return, tuyệt đối ko dùng else phía sau
//        
//        long product = 1; //tích nhân dồn, thuật toán heo đất, ốc bu dồn thịt
//        for (int i = 2; i <= n; i++) {
//            product *= i; //product = product * i;
//        }
//        return product;
//    }
    //Học về đệ quy 30s
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //Ví dụ: con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn, nhỏ hơn nữa,... đến điểm dừng
    //tính giùm tôi 6!
    //n! = 1 * 2 * 3 * 4 * 5 * 6 * ... * n
    //6! = 6 * 5!
    //5! = 5 * 4!
    //4! = 4 * 3!
    //3! = 3 * 2!
    //2! = 2 * 1!  //điểm dừng
    //1! = 1
    //quy ước 1! = 0! = 1;
    //chốt hạ: n! = n * (n-1)!
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid Argument: n must be between 0 to 20");
        }

        if (n == 0 || n == 1) {
            return 1; // két thúc cuộc chơi sớm nếu biết những đầu vào đặc biệt
        }

        return n * getFactorial(n - 1); //công thức đệ quy

    }

}
