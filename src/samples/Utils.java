package samples;

public class Utils {

    /**
     * Ïðîâåðèòü êîððåêòíîñòü ââåä¸ííîãî èíäåêñà
     *
     * @param index èíäåêñ
     * @param size  ðàçìåð ñïèñêà
     */
    public static void checkCorrectIndex(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }
}