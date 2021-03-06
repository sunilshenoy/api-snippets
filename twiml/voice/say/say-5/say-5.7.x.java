import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.Say;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.Language;

public class Example {
    public static void main(String[] args) {
        Say say = new Say.Builder("Bom dia.").voice(Say.Voice.ALICE)
            .language(Language.PT_BR).loop(2).build();
        VoiceResponse response = new VoiceResponse.Builder().say(say).build();

        try {
            System.out.println(response.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }
}
