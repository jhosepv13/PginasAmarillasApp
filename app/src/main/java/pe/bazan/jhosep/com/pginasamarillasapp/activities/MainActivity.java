package pe.bazan.jhosep.com.pginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import pe.bazan.jhosep.com.pginasamarillasapp.R;
import pe.bazan.jhosep.com.pginasamarillasapp.adapters.CompanyAdapter;
import pe.bazan.jhosep.com.pginasamarillasapp.repositories.CompanyRepository;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CompanyAdapter companyAdapter = new CompanyAdapter();
        companyAdapter.setCompany(CompanyRepository.getList());

        recyclerView.setAdapter(companyAdapter);
    }
}
