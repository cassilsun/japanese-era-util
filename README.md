```markdown
# Japanese Era Util

日本の元号（令和、平成、昭和など）に変換するJavaユーティリティ。

A lightweight Java utility for converting Gregorian dates to Japanese era names (e.g. 令和, 平成, 昭和).

---

## ✨ Features

- Convert `int` year, `LocalDate`, or `ZonedDateTime` to:
    - `Era + Year` format: `"令和6"`
    - `Year Only` format: `"6"`

---

## 🔧 Example Usage

```java
JapaneseEraUtil.getEraWithYear(2024);                      // → "令和6"
JapaneseEraUtil.getEraYearOnly(LocalDate.of(1989, 1, 8));  // → "64"
JapaneseEraUtil.getEraWithYear(ZonedDateTime.now());       // → "令和7"
```

---

## ▶️ Run Demo (Example.java)

To run the demo example class:

```bash
mvn compile exec:java -Dexec.mainClass="com.github.cassilsun.example.Example"
```

---

## 📦 Build

```bash
mvn clean package
```

---

## ☁️ Use with JitPack

### ① Add JitPack repository:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

### ② Add dependency:

```xml
<dependency>
  <groupId>com.github.cassilsun</groupId>
  <artifactId>japanese-era-util</artifactId>
  <version>v1.0.0</version>
</dependency>
```

---

## 🪪 License

This project is open-sourced under the MIT License.  
Feel free to modify or distribute with proper attribution.