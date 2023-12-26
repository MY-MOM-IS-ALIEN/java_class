package ch10_class.ex11;

public class Board {
    private long boardId;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private int boardHits;

    public Board(Long boardId, String boardTitle, String boardWriter, String boardContents) {
    }

    public long getBoardId() {
        return boardId;
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    public Board() {

    }

    public Board(long boardId, String boardTitle, String boardWriter, String boardContents, int boardHits) {
        this.boardId = boardId;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardHits = boardHits;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                '}';
    }

    public void findById(Long param1) {
        if (param1.equals(getBoardId())) {
            boardHits++;
            System.out.println("글번호 = " + boardId);
            System.out.println("제목 = " + boardTitle);
            System.out.println("저자 = " + boardWriter);
            System.out.println("내용 = " + boardContents);
            System.out.println("조회수 " + boardHits);
        }
    }
}
