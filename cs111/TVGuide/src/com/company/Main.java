package com.company;

public class Main {

    public static void main(String[] args) {
        int[] channels = {2, 4, 5, 7, 9, 11};

        String[] networks = {"CBS", "NBC", "FOX", "ABC", "My9", "CW"};

        System.out.println("What network?");
        System.out.println("Your channel is: " + channelLookup(IO.readString(), channels, networks));

        System.out.println("What channel?");
        System.out.println("Your network is: " + networkLookup(IO.readInt(), channels, networks));
    }

    public static int channelLookup(String network, int[] channels, String[] networks) {
        for (int i = 0; i < networks.length; i++) {
            if (networks[i].equalsIgnoreCase(network)) {
                return channels[i];
            }
        }

        return -1;
    }

    public static String networkLookup(int channel, int[] channels, String[] networks) {
        for (int i = 0; i < channels.length; i++) {
            if (channels[i] == channel) {

                return networks[i];

            }
        }

        return "Channel not in database";
    }
}
