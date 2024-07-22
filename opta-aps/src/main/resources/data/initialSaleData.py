import csv
import random
from datetime import datetime, timedelta

# 生成一百万条数据
num_rows = 1000000

# 商品编码和名称的示例数据
products = [
    {"code": "P001", "name": "商品1"},
    {"code": "P002", "name": "商品2"},
    {"code": "P003", "name": "商品3"},
    # 添加更多商品...
]

# 销区的示例数据
sales_areas = ["东区", "南区", "西区", "北区"]

# 定义日期范围
start_date = datetime(2023, 1, 1)
end_date = datetime(2023, 12, 31)
delta_days = (end_date - start_date).days

# 生成数据并写入CSV文件
with open('sales_data.csv', 'w', newline='', encoding='utf-8') as csvfile:
    fieldnames = ['商品编码', '商品名称', '下单日期', '下单数量', '单价', '销区']
    writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
    writer.writeheader()

    for _ in range(num_rows):
        product = random.choice(products)
        order_date = start_date + timedelta(days=random.randint(0, delta_days))
        quantity = random.randint(1, 10)
        price = round(random.uniform(10, 1000), 2)
        sales_area = random.choice(sales_areas)

        writer.writerow({
            '商品编码': product['code'],
            '商品名称': product['name'],
            '下单日期': order_date.strftime('%Y-%m-%d'),
            '下单数量': quantity,
            '单价': price,
            '销区': sales_area
        })

print(f"生成的CSV文件包含 {num_rows} 条数据，已保存为 sales_data.csv")
