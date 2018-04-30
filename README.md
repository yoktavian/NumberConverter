# NumberConverter
Android library to convert number

![Release](https://jitpack.io/v/yoktavian/NumberConverter.svg)<br/>
https://jitpack.io/#yoktavian/NumberConverter

Step by step to import library into your projects.
1. Add maven { url 'https://jitpack.io' } into your build.gradle.
```java
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
<br/>
2. Then add library from your dependencies

```java
dependencies {
    implementation 'com.github.yoktavian:NumberConverter:v1.3.4'
}
```
3. After sync gradle is finished, now you can using Number Converter library in your project.

# Features
* Convert DP Size to PX
* Convert PX Size to DP
* Convert your number into currency format
  * IDR
  * USD
  * EUR
  * CNY
  * JPY
  * MYR
  * PHP
  * PLN
  * SGD
* You can select separator for your currency format
  * Dot
  * Comma

# How to use ?
```java
formatCurrency(Context context, currency currencyFormat, separator separatorFormat, int number)
```
Context is the first parameter to change your number format.
1. Fragment
```java
  getActivity();
```
2. Activity
```java
  this
```
Currency is an enum, that used for select your currency format based on selected type IDR, USD, EUR, or other.
```java
  ConvertNumber.currency.CHOSEN_FORMAT
```
Separator is an enum, that used for add separator in your format number. Using DOT or COMMA.
```java
  ConvertNumber.separator.CHOSEN_FORMAT
```
Complete example how to convert number into currency format. I want to convert 1200000 with IDR currency format with dot separator. So i just need to write code like this
in Fragment
```java
  mTextView.setText(ConvertNumber.formatCurrency(getActivity(), ConvertNumber.currency.IDR, ConvertNumber.separator.DOT, 1200000);
```
in Activity
```java
  mTextView.setText(ConvertNumber.formatCurrency(this, ConvertNumber.currency.IDR, ConvertNumber.separator.DOT, 1200000);
```
