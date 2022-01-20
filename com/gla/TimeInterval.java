package com.gla;

import java.util.Scanner;

public class TimeInterval
{
    private int start;
    private int end;

    public TimeInterval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public static boolean canAttendMeeting(TimeInterval[] arr)
    {
        int[] start = new int[arr.length];
        int[] end = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            start[i] = arr[i].start;
            end[i] = arr[i].end;
        }
        for (int i = 0; i < arr.length-1; i++)
        {
            int temp;
            if (start[i] > start[i+1])
            {
                temp = start[i];
                start[i] = start[i+1];
                start[i+1] = temp;
            }

            if (end[i] > end[i+1])
            {
                temp = end[i];
                end[i] = end[i+1];
                end[i+1] = temp;
            }
        }
        System.out.println("Start:   End:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("  " + start[i] + "       " + end[i]);
        }
        for (int i = 0; i < arr.length-1; i++)
        {
            if (end[i] > start[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
class TimeIntervalMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TimeInterval[] tArr = new TimeInterval[5];
        System.out.println("Start Time, End Time : ");
        for (int i = 0; i < tArr.length; i++)
        {
            tArr[i] = new TimeInterval(sc.nextInt(),sc.nextInt());
        }
        boolean result = TimeInterval.canAttendMeeting(tArr);
        if (result)
        {
            System.out.println("There is no clash between meetings.");
        }
        else
        {
            System.out.println("There is clash between meetings.");
        }
    }
}