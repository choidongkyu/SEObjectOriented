package academy.pocu.comp2500.lab8;

import java.util.ArrayList;

public class Sprinkler extends SmartDevice {
    private ArrayList<Schedule> schedules;

    public Sprinkler() {
        this.schedules = new ArrayList<>();
    }

    @Override
    public void onTick() {
        ++super.tick;

        if(schedules.size() == 0) {
            return ;
        }

        if(schedules.get(0).getEndTick() + schedules.get(0).getStartTick() == tick) {//7 7
            isRunning = false;
            schedules.remove(0);
        }

        if(schedules.get(0).getStartTick() > 0 && schedules.get(0).getStartTick() <= super.tick) {//2 7
            //TODO 스케쥴 시작
            isRunning = true;
        }

    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }
}
