package Assignment6.Question4;

public class question4
{
    int empId;
    String name;

    question4(int i, String s) {
        System.out.println(s);
    }

    public void setData(int c, String d) {
        empId = c;
        name = d;
    }
    public static void main(String[] args)
    {
        //create array of question4 objs
        question4[] empObjects = new question4[2];

        //create actual employee object
        empObjects[0] = new question4(1,"a");
        empObjects[1] = new question4(2,"b");

        //assign data
        empObjects[0].setData(100,"abc");
        empObjects[1].setData(200,"xyz");

    }
}
