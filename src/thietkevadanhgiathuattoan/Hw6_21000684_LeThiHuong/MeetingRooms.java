package thietkevadanhgiathuattoan.Hw6_21000684_LeThiHuong;

import java.util.*;

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

        meetings.sort((a, b) -> a.end - b.end);

        int count = 1;
        int end = meetings.get(0).end;

        // Chọn các cuộc họp không trùng lặp với thời gian kết thúc sớm nhất
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

