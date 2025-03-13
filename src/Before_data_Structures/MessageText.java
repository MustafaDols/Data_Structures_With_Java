package Before_data_Structures;

public class MessageText {
    public static void main(String[]args){
        System.out.println(MessageText.duplicate("introduction to java " , 'a'));
        int arr [] = {1,0,3,2,4};
        System.out.println(MessageText.construct(arr));
    }
    public static StringBuilder duplicate(String text , char c){
        StringBuilder s = new StringBuilder();
        for (int i=0 ; i<text.length() ; i++) {
            s.append(text.charAt(i));
            if (text.charAt(i)==c)
                s.append(c);
        }
        return s;
    }
    public static StringBuilder construct( int [] arr ){
        StringBuilder s = new StringBuilder();
        char [] c = {'a' , 'b' , 'c' , 'd' , 'd' , 'e'};
        for (int i =0 ; i < arr.length ; i++){
            for (int j =0; j <arr[i] ; j++){
                s.append(c[i]);
            }
        }
        return s;
    }
}
