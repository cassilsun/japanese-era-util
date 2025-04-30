package com.github.cassilsun.era;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * JapaneseEraUtil - 日本の元号を扱うユーティリティクラス
 * Utility class for handling Japanese era (gengō) names.
 */
public class JapaneseEraUtil {

    /**
     * 日本の元号を表すクラス
     * Class representing a Japanese era.
     */
    public static class JapaneseEra {
        private final String name;      // 元号名 (Era name)
        private final int startYear;    // 開始年 (Start year)
        private final Integer endYear;  // 終了年（nullなら現在まで）(End year, null if still current)

        public JapaneseEra(String name, int startYear, Integer endYear) {
            this.name = name;
            this.startYear = startYear;
            this.endYear = endYear;
        }

        // 指定した年がこの元号に含まれるかどうかを判定
        // Check if the given year falls within this era
        public boolean includes(int year) {
            return year >= startYear && (endYear == null || year <= endYear);
        }

        // "令和6" のような形式で元号付き年を返す
        // Return era name with year number like "Reiwa6"
        public String getEraWithYear(int year) {
            return name + (year - startYear + 1);
        }

        // "6" のような元号年数のみを返す
        // Return only the year number within the era, like "6"
        public String getEraYearOnly(int year) {
            return String.valueOf(year - startYear + 1);
        }
    }

    // 定義されている元号一覧（明治以降）
    // List of known eras since Meiji
    private static final List<JapaneseEra> ERAS = Arrays.asList(
            new JapaneseEra("明治", 1868, 1912),
            new JapaneseEra("大正", 1912, 1926),
            new JapaneseEra("昭和", 1926, 1989),
            new JapaneseEra("平成", 1989, 2019),
            new JapaneseEra("令和", 2019, null)
    );

    /**
     * LocalDateから元号付き年を取得（例：令和6）
     * Get era name with year number from LocalDate (e.g., "Reiwa6")
     */
    public static String getEraWithYear(LocalDate date) {
        return getEraWithYear(date.getYear());
    }

    /**
     * LocalDateから元号年数のみを取得（例：6）
     * Get only the year number within the era from LocalDate (e.g., "6")
     */
    public static String getEraYearOnly(LocalDate date) {
        return getEraYearOnly(date.getYear());
    }

    /**
     * ZonedDateTimeから元号付き年を取得
     * Get era name with year number from ZonedDateTime
     */
    public static String getEraWithYear(ZonedDateTime zdt) {
        return getEraWithYear(zdt.toLocalDate());
    }

    /**
     * ZonedDateTimeから元号年数のみを取得
     * Get only the year number within the era from ZonedDateTime
     */
    public static String getEraYearOnly(ZonedDateTime zdt) {
        return getEraYearOnly(zdt.toLocalDate());
    }

    /**
     * 西暦年から元号付き年を取得（例：令和6）
     * Get era name with year number from Gregorian year (e.g., "Reiwa6")
     */
    public static String getEraWithYear(int year) {
        for (JapaneseEra era : ERAS) {
            if (era.includes(year)) {
                return era.getEraWithYear(year);
            }
        }
        return "対応外 / Unsupported";
    }

    /**
     * 西暦年から元号年数のみを取得（例：6）
     * Get only the year number within the era from Gregorian year (e.g., "6")
     */
    public static String getEraYearOnly(int year) {
        for (JapaneseEra era : ERAS) {
            if (era.includes(year)) {
                return era.getEraYearOnly(year);
            }
        }
        return "0";
    }
}

