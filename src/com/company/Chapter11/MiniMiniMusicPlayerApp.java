package com.company.Chapter11;

import javax.sound.midi.*;

public class MiniMiniMusicPlayerApp {
    public static void main(String[] args) {
        MiniMiniMusicPlayerApp mini = new MiniMiniMusicPlayerApp();
        mini.play();
    }
    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage first = new ShortMessage();
            first.setMessage(192,1,102,0);
            MidiEvent changeInstrument = new MidiEvent(first, 2);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 42, 100);
            MidiEvent noteOn = new MidiEvent(a, 2);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 12);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
