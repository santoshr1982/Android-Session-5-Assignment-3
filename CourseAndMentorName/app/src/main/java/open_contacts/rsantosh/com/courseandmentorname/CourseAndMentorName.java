package open_contacts.rsantosh.com.courseandmentorname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import open_contacts.rsantosh.com.courseandmentorname.Adapter.CourseMentorAdapter;
import open_contacts.rsantosh.com.courseandmentorname.Model.CourseMentor;

public class CourseAndMentorName extends AppCompatActivity  implements View.OnClickListener{

    //Declaration of variables.
    private ArrayList<CourseMentor> mCourseMentor;
    private CourseMentorAdapter mCourseMentorAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_and_mentor_name);

        //Initialisation of variables.
        mCourseMentor=getCourseAndMentor();

        mCourseMentorAdapter = new CourseMentorAdapter(this,R.layout.item_list_view,mCourseMentor);
        mListView= (ListView) findViewById(R.id.CourseList);
        mListView.setAdapter(mCourseMentorAdapter);

        //Setting onclick event for the list view.
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent (getApplicationContext(),MentorName.class);
                //passing the values of mentor name.
                intent.putExtra("MENTOR NAME",mCourseMentor.get(position).strMentorName);
                //passing the values of course name.
                intent.putExtra("COURSE NAME",mCourseMentor.get(position).strCourseName);
                startActivity(intent);

            }

        });

    }



    private ArrayList<CourseMentor> getCourseAndMentor() {

        //Creating the object of array list.
        mCourseMentor = new ArrayList<>();

        //Assigning the values to the array list.
        mCourseMentor.add(new CourseMentor("Android Development","Mr. Ranjith Naidu"));
        mCourseMentor.add(new CourseMentor("Core Java","Mr. Rajesh Kumar"));
        mCourseMentor.add(new CourseMentor("Front End","Mr. Ramesh"));
        mCourseMentor.add(new CourseMentor("Big Data & Hadoop","Mr. Shyam"));
        mCourseMentor.add(new CourseMentor("Robotics","Mr. Ramprasad"));
        mCourseMentor.add(new CourseMentor("Android for children","Mr. Ramachandran"));
        mCourseMentor.add(new CourseMentor("Android","Mr. Skandesh"));
        mCourseMentor.add(new CourseMentor("Business Analytics With R","Mr Srinivas"));

        return mCourseMentor;
    }

    @Override
    public void onClick(View view) {

    }
}
