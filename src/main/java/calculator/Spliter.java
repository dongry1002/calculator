package calculator;


public class Spliter {
    int[] number_arr;
    String[] sign_arr;

    public void input_spliter(String value) {
        String[] split_value = value.split(" ");
        number_arr = number_spliter(split_value);
        sign_arr = sign_spliter(split_value);
    }

    public int[] number_spliter(String[] split_value){
        number_arr = new int[(split_value.length / 2) + 1];
        int k = 0;
        for (int i = 0; i < split_value.length; i++) {
            if (i % 2 == 0) { //숫자
                number_arr[k++] = Integer.parseInt(split_value[i]);
            }
        }
        return number_arr;
    }

    public String[] sign_spliter(String[] split_value){
        sign_arr = new String[split_value.length / 2];
        int j = 0;
        for (int i = 0; i < split_value.length; i++) {
            if (i % 2 == 1) {//부호
                sign_arr[j++] = split_value[i];
            }
        }
        return sign_arr;
    }
}