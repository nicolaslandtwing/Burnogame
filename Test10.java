public class Test10 {
// Hello World
    //hhhh
    //müetereeee
    //Brunooooo
    public class Main {
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


        public class Main {
            static Integer mynumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            static Integer tries = 0;
            static JLabel text = new JLabel("Bruno, wieviele Tage brauchst du noch um den Test zu korrigieren?");
            static JTextField textField = new JTextField();


            public static void main(String[] args) {
                openui();
                System.out.println("Bruno, wieviele Tage brauchst du noch um den Test zu korrigieren?");
                //nextround();
            }

            public static void openui() {
                JFrame frame = new JFrame("Ask Bruno");
                frame.setSize(500, 300);
                frame.setLocation(500, 150);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                //JLabel text = new JLabel("Bruno, wieviele Tage brauchst du noch um den Test zu korrigieren?");
                text.setBounds(50, 50, 550, 50);

                JTextField textfield = new JTextField();
                textfield.setBounds(145, 150, 200, 30);

                // JTextField textfield2 = new JTextField();
                // textfield2.setBounds(200, 450, 200, 30);

                JButton button = new JButton("Tage");
                button.setBounds(145, 200, 200, 30);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textfromtextfield = textfield.getText();
                        Integer number = Integer.parseInt(textfromtextfield);
                        guess(number);

                    }
                });

                frame.add(button);
                frame.add(textfield);
                frame.setLayout(null);
                frame.add(text);
                frame.add(text);
                frame.setVisible(true);
            }

            public static void nextround() {
                tries++;
                Scanner scanner = new Scanner(System.in);
                Integer number = scanner.nextInt();
                guess(number);
            }

            public static void guess(Integer number) {
                if (number == mynumber) {
                    System.out.println("rrrchchrrchchrrriiichtig!");
                    text.setText("rrrchchrrchchrrriiichtig!");
                    System.out.println("rrrchchrrchchrrriiichtig! Du hesch mi " + tries + " mal frogt, du Pflock");
                    text.setText("rrrchchrrchchrrriiichtig! Frog ned emmer so e scheiss bitte!!");


                } else {

                    // String[] outputs3 = new String[]{
                    //      "Falsch, kennsch mi noni oder was", "Hallo, be de Bruno, was erwartisch vo mer?", "TEKO Style, logisch beni noni fertig", "Du hesch z'grossi Erwartige a mech"};
                    //Random random2 = new Random();
                    // System.out.println(outputs3[random2.nextInt(outputs3.length)]);
                    // text.setText(outputs3[random2.nextInt(outputs3.length)]);

                    System.out.println("Falsch, kennsch mi noni oder was?");
                    if (number < mynumber) {
                        String[] outputs = new String[]{
                                "Falsch, kennsch mi noni oder was?", "Hallo, be de Bruno, was erwartisch vo mer?", "TEKO Style, logisch beni noni fertig", "Du hesch z'grossi Erwartige a mech", "Falsch, so schnell beni ned, Korrrrona weisch", "Dumme siech, be noni fertig, be ufghalte worde", "Paperlapap, ned stresse, hocke no im Anker", "Ha d'Frog ned verstande, um was gaht's?", "Bla Bla, gaht nochli, muess no de Schnauz rassiere", "Moment, muess am kolleg no helfe usem Leder Outfitt z'cho"};
                        Random random = new Random();
                        System.out.println(outputs[random.nextInt(outputs.length)]);
                        text.setText(outputs[random.nextInt(outputs.length)]);
                    } else {
                        String[] outputs2 = new String[]{
                                "Be ja langsam, aber ned soooo langsam", "Emmer die froge, be denk scho fertig", "Frog ned emmer so seich, be scho fertig", "Be fertig, frog aber ned weg de Projektarbet bewertig bitte", "logisch beni scho fertig", "be fertig, aber ha d'Note noni am Ivo gscheckt"};
                        Random random = new Random();
                        System.out.println(outputs2[random.nextInt(outputs2.length)]);
                        text.setText(outputs2[random.nextInt(outputs2.length)]);


                    }
                    //text.setText(""); //neu

                }
                //nextround();
            }
        }

        }
    }
