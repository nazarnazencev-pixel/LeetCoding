class Solution {
    public String longestCommonPrefix(String[] strs) {
        /* 
        Сортируем элементы массива
        от минимального к маскимальному - берем их и сравниваем
        т.к. в таком случае кол-во символов позволяет узнать длинну слова 
        и упрощает поиск совпадений (нам не нужно перебирать все элементы массива строк)

        Сортировка идёт по алфавиту поэтому не ошибемся

        */
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
