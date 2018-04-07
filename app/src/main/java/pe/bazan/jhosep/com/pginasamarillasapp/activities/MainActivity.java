package pe.bazan.jhosep.com.pginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import pe.bazan.jhosep.com.pginasamarillasapp.R;
import pe.bazan.jhosep.com.pginasamarillasapp.adapters.CompanyAdapter;
import pe.bazan.jhosep.com.pginasamarillasapp.models.Company;
import pe.bazan.jhosep.com.pginasamarillasapp.repositories.CompanyRepository;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText editText;
    private CompanyAdapter companyAdapter;
    private List<Company> arrayList = CompanyRepository.getList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        companyAdapter = new CompanyAdapter();
        companyAdapter.setCompany(CompanyRepository.getList());

        recyclerView.setAdapter(companyAdapter);

        //Nuevo Codigo

        editText = findViewById(R.id.filtrador);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }

    private void filter(String s) {
        ArrayList<Company> filter = new ArrayList<>();
            for(Company comp: arrayList){
                if (comp.getName().toLowerCase().contains(s.toLowerCase())){
                    filter.add(comp);
                }
            }

            companyAdapter.filterList(filter);
    }
}
