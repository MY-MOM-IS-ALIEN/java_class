package AMW;

public class board {
    private Long boardId;
    private String boardTitle;
    private String boardWrite;
    private String boardContents;
    private int boardHits;

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWrite() {
        return boardWrite;
    }

    public void setBoardWrite(String boardWrite) {
        this.boardWrite = boardWrite;
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

    public board(Long boardId, String boardTitle, String boardWrite, String boardContents) {
        this.boardId = boardId;
        this.boardTitle = boardTitle;
        this.boardWrite = boardWrite;
        this.boardContents = boardContents;

    }

    @Override
    public String toString() {
        return "board{" +
                "boardId=" + boardId +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWrite='" + boardWrite + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                '}';
    }

    public void findByID(Long param1) {
        if (param1.equals(boardId)) {
            boardHits++;
            System.out.println("boardId = " + boardId);
            System.out.println("boardTitle = " + boardTitle);
            System.out.println("boardWrite = " + boardWrite);
            System.out.println("boardContents = " + boardContents);
        }
    }
}
