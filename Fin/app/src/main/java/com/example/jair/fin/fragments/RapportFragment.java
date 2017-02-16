package com.example.jair.fin.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.jair.fin.R;
import com.example.jair.fin.dao.FinDao;
import com.example.jair.fin.dto.olap.Rapport;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RapportFragment extends Fragment {

    public RapportFragment() {
        // Required empty public constructor
    }

    Rapport rapport;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_rapport, container, false);

        GraphView graphView = (GraphView) view.findViewById(R.id.barchart);
        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graphView);
        String[] days=new String[] {"m", "t", "w","t","f","s","s"};
        staticLabelsFormatter.setHorizontalLabels(days);

        graphView.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);



        FinDao findao= new FinDao(getActivity());
        List<Rapport> rapportList= findao.getUserRapportsByWeek(1,6,2,2017);


        DataPoint[] dataPoints = new DataPoint[7];
        for (int i =0; i<=6;i++){


            dataPoints[i] = new DataPoint(i+1,0);


        }

        for (Rapport r:rapportList){
            dataPoints[r.getDay()-1]= new DataPoint(r.getDay(),r.getAmount());
        }




/*
        BarGraphSeries<DataPoint> series=new BarGraphSeries<>(new DataPoint[]{


                new DataPoint(1,200),new DataPoint(2,58),new DataPoint(3,210),new DataPoint(4,119),
                new DataPoint(5,120),new DataPoint(6,23),new DataPoint(7,96)

        });
        */
        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(dataPoints);

        graphView.addSeries(series);
        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
            }
        });
        series.setSpacing(20);


        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.RED);


        return view;
    }



}


/*
*
*

        chart = (BarChart) view.findViewById(R.id.barchart);
        ArrayList<BarEntry> barEntries = new ArrayList<>();

        barEntries.add(new BarEntry(1,20));
        barEntries.add(new BarEntry(2,80));
        barEntries.add(new BarEntry(3,64));
        barEntries.add(new BarEntry(4,13));
        barEntries.add(new BarEntry(5,18));
        barEntries.add(new BarEntry(6,3));
        barEntries.add(new BarEntry(7,18.57f));
        BarDataSet barDataSet = new BarDataSet(barEntries,"$");
        weekdays = new ArrayList<>();
        weekdays.add("mon");
        weekdays.add("tue");
        weekdays.add("wed");
        weekdays.add("thu");
        weekdays.add("fri");
        weekdays.add("sat");
        weekdays.add("sun");


        BarData barData = new BarData(barDataSet);


        barData.setBarWidth(0.9f); // set custom bar width
//
        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);

        chart.setData(barData);
        chart.setFitBars(true);
            // make the x-axis fit exactly all bars
        chart.invalidate();


PieChart pieChart = (PieChart)view.findViewById(R.id.piechart);

        pieChart.setRotationEnabled(true);
        addDataset(pieChart);
 float[] percentages = {23f,17f,60f};
    String [] names = {"messi","neymar","suarez"};
 private void addDataset(PieChart pieChart) {
        ArrayList<PieEntry> yEntries=new ArrayList<>();
        ArrayList<String> xEntries=new ArrayList<>();

        for (int i = 0 ; i<percentages.length;i++){

            yEntries.add(new PieEntry(percentages[i],i));
        }
        for (int i = 0 ; i<names.length ; i++){

            xEntries.add((names[i]));
        }

        PieDataSet pieDataSet= new PieDataSet(yEntries,"shots on target");

    }

*/