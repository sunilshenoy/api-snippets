// Install the Java helper library from twilio.com/docs/java/install
import java.util.HashMap;
import java.util.Map;

import com.twilio.Twilio;
import com.twilio.rest.lookups.v1.PhoneNumber;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    PhoneNumber number = PhoneNumber
        .fetch(new com.twilio.type.PhoneNumber("+15108675309"))
        .setType("carrier")
        .execute();

    System.out.println(number.getCarrier().get("name"));
    System.out.println(number.getCarrier().get("type"));
  }
}