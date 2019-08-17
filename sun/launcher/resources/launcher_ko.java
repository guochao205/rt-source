package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_ko extends ListResourceBundle {
  protected final Object[][] getContents() { return new Object[][] { 
        { "java.launcher.X.macosx.usage", "\n다음은 Mac OS X에 특정된 옵션입니다.\n    -XstartOnFirstThread\n                      첫번째 (AppKit) 스레드에 main() 메소드를 실행합니다.\n    -Xdock:name=<application name>\"\n                      고정으로 표시된 기본 애플리케이션 이름을 무효화합니다.\n    -Xdock:icon=<path to icon file>\n                      고정으로 표시된 기본 아이콘을 무효화합니다.\n\n" }, { "java.launcher.X.usage", "    -Xmixed           혼합 모드를 실행합니다(기본값).\n    -Xint             해석된 모드만 실행합니다.\n    -Xbootclasspath:<{0}(으)로 구분된 디렉토리 및 zip/jar 파일>\n                      부트스트랩 클래스 및 리소스에 대한 검색 경로를 설정합니다.\n    -Xbootclasspath/a:<{0}(으)로 구분된 디렉토리 및 zip/jar 파일>\n                      부트스트랩 클래스 경로 끝에 추가합니다.\n    -Xbootclasspath/p:<{0}(으)로 구분된 디렉토리 및 zip/jar 파일>\n                      부트스트랩 클래스 경로 앞에 추가합니다.\n    -Xdiag            추가 진단 메시지를 표시합니다.\n    -Xnoclassgc       클래스의 불필요한 정보 모음을 사용 안함으로 설정합니다.\n    -Xincgc           증분적인 불필요한 정보 모음을 사용으로 설정합니다.\n    -Xloggc:<file>    시간 기록과 함께 파일에 GC 상태를 기록합니다.\n    -Xbatch           백그라운드 컴파일을 사용 안함으로 설정합니다.\n    -Xms<size>        초기 Java 힙 크기를 설정합니다.\n    -Xmx<size>        최대 Java 힙 크기를 설정합니다.\n    -Xss<size>        Java 스레드 스택 크기를 설정합니다.\n    -Xprof            CPU 프로파일 작성 데이터를 출력합니다.\n    -Xfuture          미래 기본값을 예측하여 가장 엄격한 검사를 사용으로 설정합니다.\n    -Xrs              Java/VM에 의한 OS 신호 사용을 줄입니다(설명서 참조).\n    -Xcheck:jni       JNI 함수에 대한 추가 검사를 수행합니다.\n    -Xshare:off       공유 클래스 데이터 사용을 시도하지 않습니다.\n    -Xshare:auto      가능한 경우 공유 클래스 데이터를 사용합니다(기본값).\n    -Xshare:on        공유 클래스 데이터를 사용해야 합니다. 그렇지 않을 경우 실패합니다.\n    -XshowSettings    모든 설정을 표시한 후 계속합니다.\n    -XshowSettings:all\n                      모든 설정을 표시한 후 계속합니다.\n    -XshowSettings:vm 모든 VM 관련 설정을 표시한 후 계속합니다.\n    -XshowSettings:properties\n                      모든 속성 설정을 표시한 후 계속합니다.\n    -XshowSettings:locale\n                      모든 로케일 관련 설정을 표시한 후 계속합니다.\n\n-X 옵션은 비표준 옵션이므로 통지 없이 변경될 수 있습니다.\n" }, { "java.launcher.cls.error1", "오류: 기본 클래스 {0}을(를) 찾거나 로드할 수 없습니다." }, { "java.launcher.cls.error2", "오류: {1} 클래스에서 기본 메소드가 {0}이(가) 아닙니다. 다음 형식으로 기본 메소드를 정의하십시오.\n   public static void main(String[] args)" }, { "java.launcher.cls.error3", "오류: 기본 메소드는 {0} 클래스에서 void 유형의 값을 반환해야 합니다. \n다음 형식으로 기본 메소드를 정의하십시오.\n   public static void main(String[] args)" }, { "java.launcher.cls.error4", "오류: {0} 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.\r\n   public static void main(String[] args)\r\n또는 JavaFX 애플리케이션 클래스는 {1}을(를) 확장해야 합니다." }, { "java.launcher.cls.error5", "오류: 이 애플리케이션을 실행하는 데 필요한 JavaFX 런타임 구성요소가 누락되었습니다." }, { "java.launcher.ergo.message1", "                  기본 VM은 {0}입니다." }, { "java.launcher.ergo.message2", "                  서버급 시스템에서 실행 중이기 때문입니다.\n" }, { "java.launcher.init.error", "초기화 오류" }, 
        { "java.launcher.jar.error1", "오류: {0} 파일을 열려고 시도하는 중 예상치 않은 오류가 발생했습니다." }, { "java.launcher.jar.error2", "{0}에서 Manifest를 찾을 수 없습니다." }, { "java.launcher.jar.error3", "{0}에 기본 Manifest 속성이 없습니다." }, { "java.launcher.javafx.error1", "오류: JavaFX launchApplication 메소드에 잘못된 서명이 있습니다.\\n따라서 static으로 선언하고 void 유형의 값을 반환해야 합니다." }, { "java.launcher.opt.datamodel", "    -d{0}\t  사용 가능한 경우 {0}비트 데이터 모델을 사용합니다.\n" }, { "java.launcher.opt.footer", "    -cp <디렉토리 및 zip/jar 파일의 클래스 검색 경로>\n    -classpath <디렉토리 및 zip/jar 파일의 클래스 검색 경로>\n                  클래스 파일을 검색할 {0}(으)로 구분된 디렉토리,\n                  JAR 아카이브 및 ZIP 아카이브 목록입니다.\n    -D<name>=<value>\n                  시스템 속성을 설정합니다.\n    -verbose:[class|gc|jni]\n                  상세 정보 출력을 사용으로 설정합니다.\n    -version      제품 버전을 인쇄한 후 종료합니다.\n    -version:<value>\n                  경고: 이 기능은 사용되지 않으며\n                  이후 릴리스에서 제거됩니다.\n                  실행할 버전을 지정해야 합니다.\n    -showversion  제품 버전을 인쇄한 후 계속합니다.\n    -jre-restrict-search | -no-jre-restrict-search\n                  경고: 이 기능은 사용되지 않으며\n                  이후 릴리스에서 제거됩니다.\n                  버전 검색에서 사용자 전용 JRE를 포함/제외합니다.\n    -? -help      이 도움말 메시지를 인쇄합니다.\n    -X            비표준 옵션에 대한 도움말을 인쇄합니다.\n    -ea[:<packagename>...|:<classname>]\n    -enableassertions[:<packagename>...|:<classname>]\n                  세분성이 지정된 검증을 사용으로 설정합니다.\n    -da[:<packagename>...|:<classname>]\n    -disableassertions[:<packagename>...|:<classname>]\n                  세분성이 지정된 검증을 사용 안함으로 설정합니다.\n    -esa | -enablesystemassertions\n                  시스템 검증을 사용으로 설정합니다.\n    -dsa | -disablesystemassertions\n                  시스템 검증을 사용 안함으로 설정합니다.\n    -agentlib:<libname>[=<options>]\n                  <libname> 고유 에이전트 라이브러리를 로드합니다(예: -agentlib:hprof).\n                  -agentlib:jdwp=help 및 -agentlib:hprof=help도 참조하십시오.\n    -agentpath:<pathname>[=<options>]\n                  전체 경로명을 사용하여 고유 에이전트 라이브러리를 로드합니다.\n    -javaagent:<jarpath>[=<options>]\n                  Java 프로그래밍 언어 에이전트를 로드합니다. java.lang.instrument를 참조하십시오.\n    -splash:<imagepath>\n                  이미지가 지정된 스플래시 화면을 표시합니다.\n자세한 내용은 http://www.oracle.com/technetwork/java/javase/documentation/index.html을 참조하십시오." }, { "java.launcher.opt.header", "사용법: {0} [-options] class [args...]\n           (클래스 실행)\n   또는  {0} [-options] -jar jarfile [args...]\n           (jar 파일 실행)\n여기서 options는 다음과 같습니다.\n" }, { "java.launcher.opt.hotspot", "    {0}\t  \"{1}\" VM의 동의어입니다[사용되지 않음].\n" }, { "java.launcher.opt.vmselect", "    {0}\t  \"{1}\" VM을 선택합니다.\n" } }; }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\sun\launcher\resources\launcher_ko.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */