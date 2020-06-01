class activity{
    int startTime;
    int endTime;
    boolean isChoose;
    //快速排序
    public void qSort(activity[] activity,int p,int r){
        if(p<r){
            int q=partition(activity,p, r);
            qSort(activity, p, q-1);//对左半段排序
            qSort(activity,q+1, r);//对右半段排序
        }
    }
    //实现快速排序
    public int partition(activity[] activities,int p,int r){
        int i = p + 1;//从下表为1开始排序，方便后续默认选择下表为0的作为活动开始
        int j = r;
        activity temp;//临时变量
        int x = activities[p].endTime;//用来保存p位置（前半段）结束时间
        activity t = activities[p];//用来临时存放x
        while(true){
            //开始时间小于结束时间并且不会越界
            while(activities[i].endTime< x && i<r) {
                i++;
            }
            //最后一个活动的最大结束时间大于前半段p位置的结束时间
            while(activities[j].endTime>x) {
                j--;
            }
            //循环结束
            if(i>=j) {
                break;
            }
            //用来存放当前i位置的最大结束时间

            
            temp=activities[i];
            activities[i]=activities[j];
            activities[j]=temp;
        }
        activities[p]=activities[j];
        activities[j]=t;
        return j;
    }
    //贪心算法
    public void greedSelector(activity a[],int length){
        int sum = length; //还没有被选择的活动的数量
        while (sum>0){
            int endTime = 0;//初始的结束时间是0
            int actNumbers = 0;//每个会场的活动个数
            for(int i = 0; i < length; i++){
                if (a[i].isChoose || a[i].startTime >= endTime) {
                    sum = sum-1;//还没有被选择的活动的数量-1
                    endTime = a[i].endTime;//给结束时间重新赋值
                    a[i].isChoose = true;//表示第a[i]个活动已经被选择
                    actNumbers = actNumbers + 1;//该会场的活动数量+1

                }
            }
            System.out.println("这个会场的活动个数是:"+ actNumbers);
        }
    }
    //重载构造方法
    public activity() {
    }

    public activity(int start, int end, boolean choose) {
        this.startTime= start;
        this.endTime = end;
        this.isChoose = choose;
    }


    public static void main(String[] args) {
        activity[] a=new activity[11];
        //获取对象数组的每个对象
        for(int i=0;i<11;i++){
            a[i]=new activity();
        }
        //对象数组赋值
        a[0]=new activity(1,4,false);
        a[1]=new activity(3,5,false);
        a[2]=new activity(0,6,false);
        a[3]=new activity(5,7,false);
        a[4]=new activity(3,8,false);
        a[5]=new activity(5,9,false);
        a[6]=new activity(6,10,false);
        a[7]=new activity(8,11,false);
        a[8]=new activity(8,12,false);
        a[9]=new activity(2,13,false);
        a[10]=new activity(12,14,false);
        activity b= new activity();
        b.qSort(a,0,a.length-1);
        System.out.println();
        b.greedSelector(a,a.length);


    }


}
