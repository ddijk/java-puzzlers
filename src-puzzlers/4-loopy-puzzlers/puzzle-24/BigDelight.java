class BigDelight {
    public static void main(String[] args) {

        System.out.println(0x90);
        System.out.println((0x90 & 0xff));
        System.out.println((byte)(0x90 & 0xff));

        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {

            //System.out.println("b val is "+ b+", int val is "+ (int) b);
            if (b == 0x90)
                System.out.print("Joy!");
        }
    }
}
