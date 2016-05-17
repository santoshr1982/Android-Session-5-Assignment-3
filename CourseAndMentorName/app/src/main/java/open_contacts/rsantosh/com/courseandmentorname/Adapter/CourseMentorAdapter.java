package open_contacts.rsantosh.com.courseandmentorname.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import open_contacts.rsantosh.com.courseandmentorname.Model.CourseMentor;
import open_contacts.rsantosh.com.courseandmentorname.R;

/**
 * Created by R.Santosh on 16-05-2016.
 */
public class CourseMentorAdapter extends ArrayAdapter{

    //Declaration of variables.
    private Context mContext;
    private ArrayList<CourseMentor> mCourse;
    private LayoutInflater mLayoutInflater;

    public CourseMentorAdapter(Context context, int resource, ArrayList<CourseMentor> mCourse) {
        super(context, resource);
        this.mContext = context;
        this.mCourse = mCourse;
        this.mLayoutInflater = mLayoutInflater.from(mContext);
    }

    //This will derive the size of the array list.
    @Override
    public int getCount() {
        return mCourse.size();
    }

    //This will get the position of the array list.
    @Override
    public Object getItem(int position) {
        return mCourse.get(position);
    }


    //This will return the Item ID.
    @Override
    public long getItemId(int position) {
        return 0;
    }

    //This will display the output in a formatted way.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //This checks for the null value.
        if(convertView==null){

            convertView = mLayoutInflater.inflate(R.layout.item_list_view,parent,false);

        }

        //Assigining the values into respective fields.
        TextView textView = (TextView) convertView.findViewById(R.id.courseName);

        CourseMentor courseMentor = (CourseMentor) getItem(position);

        textView.setText(courseMentor.strCourseName);

        return convertView;
    }
}
