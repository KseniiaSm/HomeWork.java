package generics.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    //нужно написать extends Participant - чтобы нельзя было любые типы
    // данных добавить, типа стринга
    // добавляем дженерикс, чтобы нельзя было мешать в один аррей лист членов разных команд
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant (T participant){
        participants.add(participant);
        System.out.println("В команду " + name + "был добавлен новый участник " +
                "его имя: " + participant.getName());
    }

    public void playWith(Team<T> team){
        //Team<T> team - чтобы школьнки играли только со школьниками
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
                if(i==0){
                    winnerName = this.name;
                } else {
                    winnerName = team.name;
                }
        System.out.println("Выйграла команда " + winnerName);
    }
}
