# Абстрактные классы и интерфейсы 

7.8. Поменять ключи и значения в Map

___

Задача
--------

>Напишите метод, который получает на вход Map<K, V> и возвращает Map, где ключи и значения поменяны местами. Так как значения могут совпадать, то тип значения в Map будет уже не K, а

~~~Java
    Collection<K>
~~~

То есть сигнатура `метода` выглядит так:

~~~Java
    public static <K, V> Map<V, Collection<K>> 
~~~

___
Решение:
--------

~~~Java
    public static <K, V> Map<V, Collection<K>> inverse(Map<? extends K, ? extends V> map){
        Map<V, Collection<K>> resultMap = new HashMap<>();

        Set<K> keys = map.keySet();
        for(K key : keys){
            V value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if(ks == null){
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }

        return resultMap;
    }
~~~


Итог: 
--------

>- [X] Есть готовое решение :heavy_check_mark:
>- [ ] Свой код написан :heavy_check_mark:

Сложность :white_check_mark: :white_check_mark: :white_check_mark:
