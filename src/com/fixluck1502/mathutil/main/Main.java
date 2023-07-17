/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fixluck1502.mathutil.main;

import com.fixluck1502.mathutil.core.MathUtil;

/**
 *
 * @author caube
 */
public class Main {
    public static void main(String[] args) {
        
        // thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        // ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        // ví dụ đưa vào -5 coi tính đc ko, đưa vào 0, 20, 21
        // TEST CASE: MỘT TÌNH HUỐNG HÀM/APP/MÀN HÌNH/TÍNH NĂNG ĐC ĐƯA VÀO SỬ DỤNG
        // ĐỂ GIẢ LẬP HÀNH VI XÀI CỦA AI ĐÓ!!!
        
        // TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG APP, XÀI APP (HÀM) MÀ NÓ BAO HÀM
        // INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        // OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÝ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG 
        // ĐẦU VÀO ĐỂ XỬ LÝ
        // KỲ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        // SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KỲ VỌNG HAY KO\
        
        long expected = 120; // tao kỳ vọng ói về 120 nếu tính 5!
        int n = 5;           // input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected +" expected");
        System.out.println("5! = " + actual + " actual");  
    }
}
