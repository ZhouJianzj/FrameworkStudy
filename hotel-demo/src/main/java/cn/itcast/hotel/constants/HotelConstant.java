package cn.itcast.hotel.constants;

/**
 * @author zhoujian
 */
public class HotelConstant {

    public static  final  String MapDSL  = "{\n" +
            "  \"mappings\": {\n" +
            "    \"properties\": {\n" +
            "      \"id\":{\n" +
            "        \"type\": \"keyword\"\n" +
            "      },\n" +
            "      \"name\":{\n" +
            "        \"type\": \"text\",\n" +
            "        \"analyzer\": \"ik_max_word\",\n" +
            "        \"copy_to\": \"all\"\n" +
            "      },\n" +
            "      \"address\":{\n" +
            "        \"type\": \"keyword\",\n" +
            "        \"index\": \"false\"\n" +
            "      },\n" +
            "      \"price\":{\n" +
            "        \"type\": \"integer\"\n" +
            "      },\n" +
            "      \"score\":{\n" +
            "        \"type\": \"integer\"\n" +
            "      },\n" +
            "      \"brand\":{\n" +
            "        \"type\": \"keyword\"\n" +
            "      },\n" +
            "      \"city\":{\n" +
            "        \"type\": \"keyword\",\"copy_to\": \"all\"\n" +
            "      },\n" +
            "      \"star_name\":{\n" +
            "        \"type\": \"keyword\",\"copy_to\": \"all\"\n" +
            "      },\n" +
            "      \"business\":{\n" +
            "        \"type\": \"text\",\n" +
            "        \"index\": \"false\"\n" +
            "      },\n" +
            "      \"location\":{\n" +
            "        \"type\": \"geo_point\",\n" +
            "        \"index\": \"false\"\n" +
            "      },\n" +
            "      \"pic\":{\n" +
            "        \"type\": \"keyword\",\n" +
            "        \"index\": \"false\"\n" +
            "      },\n" +
            "      \"all\":{\n" +
            "        \"type\": \"text\",\n" +
            "        \"analyzer\": \"ik_max_word\"\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}";


    public static  final  String HOTEL_TOPIC_EXCHANGE = "hotel.topic.exchange";

    public static  final  String HOTEL_DELETE_QUEUE = "hotel.delete.queue";
    public static  final  String HOTEL_DELETE_QUEUE_KEY= "hotel.delete.key";

    public static  final  String HOTEL_INSERT_QUEUE = "hotel.insert.queue";
    public static  final  String HOTEL_INSERT_QUEUE_KEY = "hotel.insert.key";

}

