// Generate Alphanumeric OTP

// “Write a Java program to generate a random alphanumeric OTP of length n.
// The OTP should contain a mix of uppercase letters, lowercase letters, and digits.”

class test8
{
    public static void main(String[] args) {
        int n=6;
        String chars="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789";
        String otp="";
        for(int i=0;i<n;i++)
        {
            int index=(int)(Math.random() * chars.length()); //random * 62---char(index);
            otp=otp+chars.charAt(index);

        }

        System.out.print(otp);
    }
}