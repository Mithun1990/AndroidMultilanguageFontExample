# AndroidMultilanguageFontExample
## This is an example of different font for different language in android application
>>> The process can be done by following below steps
1. Create font folder in res/font directory. Put all font files (.ttf) here.
2. Create different style files for each supported languages such as theme-ja.xml, theme-bn.xml. 
3. Create font style for different language like below 
```xml
    /* theme.xml */
    <style name="FontRegular">
        <item name="fontFamily">@font/en_regular</item>
    </style>
```
```xml
    /* theme-ja.xml */
    <style name="FontRegular">
        <item name="fontFamily">@font/ja_regular</item>
    </style>
```
4.Then, use the FontRegular style in xml fil where needed
```xml
    <TextView
        android:id="@+id/textView"
        style="@style/FontRegular"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/title_one"
      />
```
