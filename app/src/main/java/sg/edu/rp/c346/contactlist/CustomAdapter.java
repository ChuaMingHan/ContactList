package sg.edu.rp.c346.contactlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010265 on 07/24/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_content;
    int layout_id;
    ArrayList<ContactsItem> contactList;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactsItem> objects) {
        super(context, resource, objects);
        parent_content = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_content.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.Name);
        TextView tvCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvNumber = rowView.findViewById(R.id.textViewPhoneNum);
        ContactsItem currentItem = contactList.get(position);
        String name = currentItem.getName();
        int code = currentItem.getCode();
        int number = currentItem.getNumber();
        tvName.setText(name);
        tvCode.setText("+" + code + "");
        tvNumber.setText(number + "");

        return rowView;
    }
}
