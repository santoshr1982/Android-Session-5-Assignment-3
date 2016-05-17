package open_contacts.rsantosh.com.courseandmentorname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MentorName extends AppCompatActivity {

    //Declaration of variables.
    private String mMentorName;
    private TextView textView;
    private String mCourseName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor_name);


        //Initialisation of variables.
        textView = (TextView) findViewById(R.id.mentor_name);

        //Getting intent from the list view.
        Intent getIntent = getIntent();

        //Storing values to the variables.
        mMentorName = getIntent.getStringExtra("MENTOR NAME");
        mCourseName = getIntent.getStringExtra("COURSE NAME");

        //Displaying the mentor name with the course name.
        textView.setText(mMentorName + " is the mentor for " + mCourseName + ".");

    }
}
