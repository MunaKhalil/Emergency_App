package com.example.emergencyapp;

public class CasesMockup {
    private String name;
    private String Instructions;
    private int image;

    public static final CasesMockup []cases={
            new CasesMockup("Superficial wounds","1-Hand Washing: Wash your hands thoroughly with soap and water, and wear gloves.\n \n" +
                    "2-Remove Jewelry: Take off any jewelry from the injured area.\n \n" +
                    "3-Stop the Bleeding: Apply direct pressure to the wound without tightly wrapping around it.\n \n" +
                    "4-Clean the Wound: After bleeding stops, clean the wound with saline solution or bottled water.\n \n" +
                    "5-Remove Contaminants: Inspect the wound and remove any dirt or foreign objects.\n \n" +
                    "6-Clean Surrounding Area: Gently clean around the wound with soap and water.\n \n" +
                    "7-Cover the Wound: Cover with a sterile, clean bandage; leave open if the wound is contaminated.\n \n" +
                    "8-Pain Relief: Take pain relievers and change the bandage every 24 hours.",R.drawable.superficialwounds),
            new CasesMockup("Burns","1-Move the Person Away from the Source of the Burn: If the burn is due to fire or hot materials, move the person away from the source immediately.\n" +
                    "\n" +
                    "2-Cool the Burned Area: Place the burned area under cool (not icy) running water for 10-20 minutes to reduce pain and stop the heat from spreading. Avoid using ice directly on the burn as it may damage the skin.\n" +
                    "\n" +
                    "3-Remove Tight Objects: If the burn is on a hand or finger, gently remove rings or watches before the skin starts to swell.\n" +
                    "\n" +
                    "4-Cover the Burn with a Clean, Sterile Bandage: Use a sterile gauze pad or clean cloth, and avoid applying pressure. Do not use cotton directly on the burn.\n" +
                    "\n" +
                    "5-Avoid Popping Blisters: If blisters form, do not pop them as they protect the wound from infection.\n" +
                    "\n" +
                    "6-Take Pain Relievers: Pain relievers like acetaminophen or ibuprofen can help alleviate the pain.\n" +
                    "\n" +
                    "7-Seek Medical Help: It’s advisable to see a doctor if the burn is severe, covers a large area, or is on the face, joints, or genitals.\n" +
                    "\n" +
                    "Important Notes\n" +
                    "**Do Not Apply toothpaste, butter, or any greasy substances on the burn, as they may increase the risk of infection.\n" +
                    "**If the Burn Is Caused by Chemicals: Rinse the area with running water for at least 20 minutes and seek medical help immediately., tea and mint optional",R.drawable.burn),
            new CasesMockup("Electrical injuries","1-Ensure Safety First: Do not approach the person until you are certain the power source has been turned off. If the person is still in contact with the source, do not touch them with your bare hands. Switch off the power source if it is safe to do so.\n" +
                    "\n" +
                    "2-Call Emergency Services: Contact emergency services immediately, as electrical injuries can cause severe internal damage, even if no visible injuries are present.\n" +
                    "\n" +
                    "3-Check for Breathing and Pulse: If the person is unconscious, check for breathing and a pulse. If they are not breathing, start CPR (Cardiopulmonary Resuscitation) if you are trained to do so.\n" +
                    "\n" +
                    "4-Treat for Shock: Electrical injuries may lead to shock. If the person is conscious, help them lie down and stay calm. Elevate their legs slightly if possible to improve blood flow.\n" +
                    "\n" +
                    "5-Look for Burns and Other Injuries: Electrical injuries often cause burns, especially at entry and exit points of the current. If burns are visible, cover them with a sterile, non-stick dressing.\n" +
                    "\n" +
                    "6-Monitor Vital Signs: Keep an eye on the person's breathing and heart rate until help arrives.\n" +
                    "\n" +
                    "7-Avoid Moving the Person: Unless there is immediate danger, avoid moving the person, as electrical injuries can cause muscle and bone damage.\n" +
                    "\n" +
                    "8-Consult Medical Professionals: Even if the injury appears minor, it’s important for the person to receive medical attention as electrical injuries can cause internal damage.\n" +
                    "\n" +
                    "Important Notes\n" +
                    "**Do not use water on burns from electrical injuries.\n" +
                    "**Be mindful of spinal injuries: Electrical injuries may cause sudden muscle contractions that could impact the spine.\n" +
                    "**Use insulated materials to remove the source if needed, like a wooden stick, rubber gloves, or a dry cloth.",R.drawable.electricalinjuries),
             new CasesMockup("Fractions","1-Ensure Safety: Make sure the area is safe for you and the injured person to avoid further harm.\n" +
                     "\n" +
                     "2-Call Emergency Services: Contact emergency services if the injury is severe or if there’s a visible deformity in the affected limb.\n" +
                     "\n" +
                     "3-Do Not Move the Injured Limb: Avoid moving the fractured limb. Stabilize it in place with a splint or any straight object, such as a stick, and gently tie it to keep the bone steady.\n" +
                     "\n" +
                     "4-Apply Ice: Place an ice pack or a cold cloth on the injured area to reduce swelling and pain. Avoid putting ice directly on the skin.\n" +
                     "\n" +
                     "5-Elevate the Injured Limb: If possible, elevate the injured limb slightly to help reduce swelling.\n" +
                     "\n" +
                     "6-Avoid Giving Food or Drink: Refrain from giving the injured person food or drink, as they may need surgery, which requires an empty stomach.\n" +
                     "\n" +
                     "Important Notes\n" +
                     "**Do Not Try to Realign the Bone: Avoid pressing or moving the broken bone.\n" +
                     "**Consult a Doctor: The fracture should be examined by a medical professional to prevent complications.",R.drawable.fractions),
            new CasesMockup("Choking","1-Encourage Coughing: If the person can cough or talk, encourage them to cough forcefully, as this may help dislodge the object.\n" +
                    "\n" +
                    "2-Perform Five Back Blows: If choking continues, stand behind the person and give five firm blows between their shoulder blades with the heel of your hand.\n" +
                    "\n" +
                    "3-Abdominal Thrusts (Heimlich Maneuver): If back blows do not work, stand behind the person, make a fist and place it just above their navel, below the ribcage. Grasp your fist with your other hand and press inward and upward quickly and forcefully.\n" +
                    "\n" +
                    "4-Alternate Steps if Necessary: Repeat the sequence of five back blows and five abdominal thrusts until the object is expelled or help arrives.\n" +
                    "\n" +
                    "5-Call Emergency Services: If the choking persists, call emergency services immediately.\n" +
                    "\n" +
                    "6-Perform CPR if Needed: If the person becomes unresponsive, start CPR until medical help arrives.\n" +
                    "\n" +
                    "Important Notes\n" +
                    "**For infants under one year: Place the baby face down on your forearm and give five gentle back blows between the shoulder blades.\n" +
                    "**Do not use abdominal thrusts on young children or infants, as it can cause injury.",R.drawable.choking),
    };
    public CasesMockup() {
    }

    public CasesMockup(String name, String instructions, int image) {
        this.name = name;
        Instructions = instructions;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String instructions) {
        Instructions = instructions;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
