package reverse;

/**
 * @author 阡陌兮
 * @version 1.0.0
 * @date 2018-12-25 15:07
 * @description 字符串反转
 */
class ReverseElement {

    /**
     * @param element 字符串
     * @return result 反转之后的字符串
     * @description 使用StringBuilder的reverse()方法。
     * */
    static String reverseElement1(String element){
        StringBuilder result = new StringBuilder(element);
        return result.reverse().toString();
    }

    /**
     * @param element 字符串
     * @return result 反转之后的字符串
     * @description 使用字符串数组,实现从尾部开始逐个逆序放入字符串.
     * */
    static String reverseElement2(String element)
    {
        //String转换成字符数组
        char[] charArray = element.toCharArray();
        //定义一个空字符串
        StringBuilder result = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--){
            result.append(charArray[i]);
        }
        return result.toString();
    }

    /**
     * @param element 字符串
     * @return result 反转之后的字符串
     * @description 使用String的CharAt方法取出字符串中的各个字符.
     * */
    static String reverseElement3(String element) {
        StringBuilder result = new StringBuilder();
        int length = element.length();
        for (int i = 0; i < length; i++) {
            result.insert(0, element.charAt(i));
        }
        return result.toString();
    }

}
