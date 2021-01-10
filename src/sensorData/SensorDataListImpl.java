package sensorData;

import java.util.ArrayList;

public class SensorDataListImpl implements  SensorDataList{
    ArrayList<SensorData> sdList = new ArrayList<>();

    @Override
    public void add(SensorData data) {
        sdList.add(data);
    }

    @Override
    public SensorData get(int g) {
        return sdList.get(g);
    }

    @Override
    public long getAverage() {
        long res = 0;

        for(int i = 0; i < sdList.size(); i++){
            res += sdList.get(i).getValue();
        }
        res /= sdList.size();

        return res;
    }

    @Override
    public int getLength() {
        return sdList.size();
    }

    @Override
    public long getAverageOfSensor(String SensorName) {
        long res = 0;
        int d = 0;

        for(int i = 0; i < sdList.size(); i++){
            if(SensorName == sdList.get(i).getSensorName()) {
                res += sdList.get(i).getValue();
                d++;
            }
        }
        res /= d;

        return res;
    }
}
