public class Account extends Bank
{
        String acc_name;
        String acc_email;

        public double cal_bal()
        {
            return 0.0;
        }

        public Account(String name,String email) {
        this.acc_email=email;
        this.acc_name=name;
        }


        
}