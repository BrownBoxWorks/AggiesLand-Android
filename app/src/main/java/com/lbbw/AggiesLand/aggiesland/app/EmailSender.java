package com.lbbw.AggiesLand.aggiesland.app;

/**
 * Created by Quis on 7/16/2014.
 */

/*import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.service.textservice.SpellCheckerService;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.content.Context;
import android.widget.EditText;


import java.util.Properties;
public class EmailSender extends Activity implements OnClickListener {

   SpellCheckerService.Session session = null;
    ProgressDialog pdialog = null;
    Context context = null;
    EditText reciept = null;
    EditText sub = null;
    EditText msg = null;
    String recpient = null;
    String subject = null;
    String textmessage = null;




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        context = this;


    }


           @Override
              public void onClick(View v){
               recpient = reciept.getText().toString();
               subject = sub.getText().toString();
               textmessage = msg.getText
                       ().toString();
               Properties props = new Properties();
                props.put("mail.smtp.host","smtp.gmail.com");
               props.put("mail.smtp.socketFactory.port","465");
               props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
               props.put("mail.smtp.auth","true");
               props.put("mail.smtp.port","465");

               session = SpellCheckerService.Session.getDefaultInstance(props, new javax.mail.Authentication();



           }}*/





/*import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MailSenderActivity extends Activity {

    /** Called when the activity is first created. */
   /* @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        final Button send = (Button) this.findViewById( R.id.send);
        send.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                try {
                    GmailSender sender = new GMailSender("username@gmail.com", "password");
                    sender.sendMail("This is Subject",
                            "This is Body",
                            "user@gmail.com",
                            "user@yahoo.com");
                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }


            }
        });

    }
}

*/
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class EmailSender extends Activity {

    Button buttonSend;
    EditText textTo;
    EditText textSubject;
    EditText textMessage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);

        buttonSend = (Button) findViewById(R.id.buttonSend);
        textTo = (EditText) findViewById(R.id.editTextTo);
        textSubject = (EditText) findViewById(R.id.editTextSubject);
        textMessage = (EditText) findViewById(R.id.editMessage);
        
        buttonSend.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                String to = textTo.getText().toString();
                String subject = textSubject.getText().toString();
                String message = textMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
                //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);

                //need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));

            }
        });
    }
}






