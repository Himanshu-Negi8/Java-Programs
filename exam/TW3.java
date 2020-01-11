public class TW3 {
public static void main(String[] args) {
String str = "BOTTTTTTTT";
System.out.println(str);
int freq[] = new int[str.length()];
char minChar = str.charAt(0);
char[] arr = str.toCharArray();
for(int i=0; i<arr.length; i++) {
for(int j=i+1; j<arr.length; j++) {
if(arr[i] == arr[j] && arr[i] !='0') {
freq[i]++;
arr[j] = '0';
}
}
}
int min = freq[0];
for(int i=0; i<freq.length; i++) {
if(freq[i]<min && arr[i] != '0')
minChar = arr[i];
}
System.out.println("Least Character = "+minChar);
}
}