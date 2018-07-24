package sg.edu.rp.c346.contactlist;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;
    ArrayList<ContactsItem> alContactList;
    CustomAdapter caContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();


        ContactsItem contacts1 = new ContactsItem("Mary", 65, 65442334);
        ContactsItem contacts2 = new ContactsItem("Ken", 65, 97442437);
        alContactList.add(contacts1);
        alContactList.add(contacts2);

        caContacts = new CustomAdapter(this, R.layout.contacts_item, alContactList);

        lvContacts.setAdapter(caContacts);
    }
}
