package com.github.cassilsun.example;

import com.github.cassilsun.era.JapaneseEraUtil;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Example {
    public static void main(String[] args) {
        int year = 2024;
        LocalDate date = LocalDate.of(1989, 1, 8);
        ZonedDateTime nowInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("西暦 " + year + "年 → " + JapaneseEraUtil.getEraWithYear(year));       // 平成
        System.out.println("LocalDate " + date + " → " + JapaneseEraUtil.getEraWithYear(date)); // 昭和64
        System.out.println("ZonedDateTime.now → " + JapaneseEraUtil.getEraWithYear(nowInTokyo)); // 当前令和
    }
}
