package thietkevadanhgiathuattoan.hw7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MeetingRooms {
    public static int maxMeetings(List<Meeting> meetings) {
        if (meetings == null || meetings.isEmpty()) {
            return 0;
        }

        meetings.sort(Comparator.comparingInt(a -> a.end));

        int count = 1;
        int end = meetings.getFirst().end;

        for (int i = 1; i < meetings.size(); i++) {
            if (meetings.get(i).start > end) {
                count++;
                end = meetings.get(i).end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting(1, 3));
        meetings.add(new Meeting(0, 4));
        meetings.add(new Meeting(1, 2));
        meetings.add(new Meeting(4, 6));
        meetings.add(new Meeting(3, 5));
        meetings.add(new Meeting(5, 7));

        int maxMeetings = maxMeetings(meetings);
        System.out.println("Maximum number of meetings: " + maxMeetings);
    }
}
