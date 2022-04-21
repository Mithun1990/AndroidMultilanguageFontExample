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
4.
