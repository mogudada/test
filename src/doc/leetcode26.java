package doc;
public class leetcode26 {
    public static void main(String[] args) {
        leetcode26 lt = new leetcode26();
        int []num = {0,1,1,2,2,3,3,4};
        System.out.println(lt.removeDuplicates(num));
    }

    // �ӽ�ȥAC����
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        //�ж�������
        int number = 0;//��Ǽ���
        for (int i=0; i < nums.length ; i++) {
            if ( nums[i] != nums[number] ) {
                number++;
                nums[number] = nums[i];
            }
        }
        number+=1; //���+1��Ϊ���ָ���
        return number;
    }

}
