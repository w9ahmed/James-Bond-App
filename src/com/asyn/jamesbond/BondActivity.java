package com.asyn.jamesbond;

import com.asyn.jamesbond.adapters.BondListAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class BondActivity extends Activity {

	protected ExpandableListView bondsList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bond_activity);

		bondsList = (ExpandableListView) findViewById(R.id.bondsListView);

		BondListAdapter adapter = new BondListAdapter(this, getResources()
				.getStringArray(R.array.list_of_bond_actors), getResources()
				.getStringArray(R.array.bonds_details));
		bondsList.setAdapter(adapter);

	}
}
