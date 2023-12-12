# 프로젝트 주제 (어떤 프로젝트 인가)

- 사용자들이 소장하고 있는 도서를 교환하거나 판매할 수 있는 플랫폼을 만든다. 도서 등록 및 조회, 메시징 시스템 등을 포함하여 사용자들 간의 도서 교환 및 판매를 용이하게 할 뿐 아니라, 독서 리뷰와 책 추천 등의 기능을 통해 궁극적으로 종합적인 도서 공유 서비스를 제공하는 프로젝트

## 프로젝트 기획 배경 및 목표 (왜 만들었고 무엇을 할 것인가, Application 사용 주요 타겟층은)

- 현대 사회에서는 책을 한 번 읽으면 책장에 방치되는 경우가 많습니다. 이러한 책들이 필요한 사람들에게 재활용되지 않고 방치되는 것은 자원의 낭비일 뿐만 아니라 독서 문화의 활성화에도 제약을 줄 수 있습니다. 우리들 연결책은 이러한 문제에 대해 한가지의 길을 제공하는 것을 목표로 이 프로젝트를 기획하였습니다.
- 집에 있는 책을 필요한 사람들과 공유하여 새로운 독서 경험을 제공하는 서비스를 구축합니다. 가지고 있는 책을 다른 사용자와 교환 혹은 판매를 할 수 있도록 합니다. 또한 원하는 이들은 어려운 가정이나 아동센터등에 책을 선물하기를 통해 도움을 줄 수 있는 서비스도 있습니다.
- 이 외에도 독서 리뷰, 내 주변 도서찾기 기능을 만들어 종합적인 도서 공유서비스를 구현하려 합니다.
- Application 사용 주요 타겟층 : 전공도서, 교과서가 필요한 사람들, 집에 어린이가 있는 사람들

독서를 좋아하는 사람들, 책이 필요한 사람, 집에 안 보는 책이 많은 사람

### 주요 기능

0. 회원(다연) 프로필사진

1. **내 주변 지도(진우 성준)** / ISBN(성준) / 거래관련 페이지 - 편집툴 넣기 (성준 다연)
2. 실시간 채팅(소켓) (진우 )
3. 주요 화면 UI

메인페이지(이 달의 독서왕, 조회수가 높은 )

https://lh7-us.googleusercontent.com/Pvth8AMwHM6sNGYyyXkjjj4yfKPp4Ct50L5KwgJW9Z0QP6KC-cz3B8nOavf3Oy5Hclydaqt5RF7kAEmRxEGo2Oje5Yg92HCb1FAfEoHNl6fBtx4HM774H5OifFn_Xvn25HcJhSYED0xf

https://lh7-us.googleusercontent.com/niNLPGsYUVob3FALG3xOzUizJj1pGq_8C7pXqywI6adNxlEACfM8DtYzKbgku-isSFweGZE5mH-phbL9Es-zH5v4eg_0Vq3QuF7OvCSKV2sC_hQ_Xuge3bmVBM8P0WZFrB_Y5jjPDJEj

https://lh7-us.googleusercontent.com/6BTaYwc2SzwzhWv8Qk9ag92t3fW1MNQFHmjJe1wcz6K9hTuB0iP0UgiDneAXUyLy5h5DKBymAEbaZdeczNp63J6orADStcsXot_3fXSkYBCVQTOhp6ItUosmrrpdzijnhX8TZHHjVQn0

거래평가 페이지

https://lh7-us.googleusercontent.com/QqoyM2zJojruXv8DvI4YxCBgOOGuUOCVq1qCH7SdllBTFTLkuDB6sY3fg9698tw4L6of5CXeCyw4vEnfj544Rwxdpw02VX5tf_XxQHGGSc5L79wAesCpf-7dHlVwkk2hH9H672-OquFk

1. 개발 환경 및 사용 기술
    1. 개발 환경

자바 스프링부트, 오라클, git,

1. 사용 기술
    
    jquery, ajax, kakao api, naver api
    
2. Database Diagram 설명
- Grade(등급)
- 점수마다 정해지는 등급이 있는 테이블
- Message(쪽지)
    - 쪽지 기능을 넣은 테이블
- User(유저)
    - 사용자 테이블
- Warning User(경고받은사람들)
    - 3번 경고 받으면 정지되는 시스템을 구현하기 위해 경고 받은 횟수
- Ratting(거래점수)
    - 거래후 거래자(판매자,구매자,교환자)가 작성한 점수가 있는 테이블
- BoardList(게시판 종류)
    - 게시판 종류별 구분하기 위한 테이블
- board(게시판 테이블)
    - 게시판 글 내용이 있는 테이블
- Book Board(책 관련 테이블)
    - 판매, 구매에는 책 관련 정보들이 저장되어서 책 관련 정보도 있는 테이블
- Reply(댓글)
    - 게시판 댓글 테이블

### 역할 분담 (1인 프로젝트 시 불필요)(각 조원별로 맡은 역할 또는 구현할 기능)

결제시스템, 유저 관리,  판매(교환)관련, 쪽지 관리, 기부, 별점기능+신고, 독서 리뷰,

김진우 : 로그인 기능, 회원가입 기능, 내 주변 중고도서,

정다연 : 쪽지 주고받기, 거래 평가, 독서 리뷰 페이지, 고객센터 페이지

홍성준 : 판매 페이지 게시판, 교환 페이지 게시판,
