# Japanese Era Utility（日付元号変換ユーティリティ）

A lightweight Java utility to convert Gregorian dates into Japanese era (gengō) format.

西暦日付を日本の元号（令和・平成・昭和など）に変換するための軽量Javaユーティリティです。

---

## 🌟 Features（特徴）

- Supports conversion from `int` year, `LocalDate`, and `ZonedDateTime`.
- Provides two formatting styles:
    - **Era + Year**: `令和6`
    - **Year Only**: `6`

- `int`年、`LocalDate`、`ZonedDateTime`の各タイプから元号変換が可能。
- 出力形式は以下の2種類をサポート：
    - **元号＋年数**: `令和6`
    - **年数のみ**: `6`

---

## 📌 Example Usage（使用例）

```java
// From int year
JapaneseEraUtil.getEraWithYear(2024);                      // → "令和6"

// From LocalDate
JapaneseEraUtil.getEraYearOnly(LocalDate.of(1989, 1, 8));  // → "64"

// From ZonedDateTime
JapaneseEraUtil.getEraWithYear(ZonedDateTime.now());       // → 現在の元号 (e.g., "令和7")
```

---

## 🚀 Running the Demo（デモの実行方法）

Execute `Example.java` to see sample output:

以下のコマンドでデモを実行できます：

```bash
mvn compile exec:java -Dexec.mainClass="com.github.cassilsun.example.Example"
```

---

## 📦 Installation（導入方法）

You can manually add the source code or use build tools like Maven.

ソースコードを手動で追加するか、Maven等のビルドツールを使用して導入できます。

---

## 💬 Contributions & Issues（貢献・問題報告）

Feel free to submit issues or pull requests.

バグ報告や改善提案、プルリクエストは大歓迎です。

---

## 📝 License（ライセンス）

MIT © [Ryan Zhang]

MITライセンスに基づき配布されています。

